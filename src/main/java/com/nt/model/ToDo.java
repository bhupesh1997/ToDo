package com.nt.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.source.doctree.SerialDataTree;
import lombok.Data;

@Entity
@Table(name = "TO_DO")
@Data
public class ToDo implements Serializable {
	
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "emp_id_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.IDENTITY)
	private Integer taskno;
	@Column(length = 20)
	private String taskname;
	@Column(length = 20)
	private Integer duration;
	
	private String startdate;
	
	private String enddate;
	
	private String taskdescription;

	
	private String currenttask;
	private String upcomingtask;
	private String previoustask;

}
