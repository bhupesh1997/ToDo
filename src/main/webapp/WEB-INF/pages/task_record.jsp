<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
<c:when test="${!empty empsData}">
<table border="1" bgcolor="cyan" align="center">
<tr>
<th>TaskNo</th>
<th>CurrentTask</th>
<th>UpcomingTask</th>
<th>PreviousTask</th>
<th>TaskName</th>
<th>Duration</th>
<th>StartDate</th>
<th>EndDate</th>
<th>TaskDescription</th>

</tr>
<c:forEach var="todo" items="${empsData}">
<tr>
    <td>${todo.taskno}</td>
    <td>${todo.currenttask}</td>
    <td>${todo.upcomingtask}</td>
    <td>${todo.previoustask}</td>
     <td>${todo.taskname}</td>
     <td>${todo.duration}</td>
     <td>${todo.startdate}</td>
      <td>${todo.enddate}</td>
      <td>${todo.taskdescription}</td>
    <td><a href="edit?no=${todo.taskno}"><img src="images/edit.png" width="50"height="50"/></a>&nbsp;&nbsp;&nbsp;<a onclick="comfirm('Do you want to delete the record')"href="delete?no=${todo.taskno}"><img src="images/delete.jpg" width="50"height="50"></a></td>
    <td>${todo.taskno}</td>
  </tr>  
 </c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">Records not found</h1>
</c:otherwise>
</c:choose>
<br><br>
<hr>
<h1 style="text-align:center"><a href="createtask"><img src="images/add.png" width="50" height="50">Create Task</a></h1>
<td>

         </td>
