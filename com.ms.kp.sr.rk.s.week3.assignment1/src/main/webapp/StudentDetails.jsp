<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<h2>Student Grading System</h2>
	<form action="Calc" method="post">
		<lable>First Name: </lable>
		<input type="text" name="fname"><br>
		<lable>Last Name: </lable>
		<input type="text" name="lname"><br>
		<lable>Enrollment Number: </lable>
		<input type="text" name="enrollnum"><br>

		<table>
			<tr>
				<th>Subject</th>
				<th>Obtained Marks</th>
				<th>Total Marks</th>
			</tr>
			<tr>
				<td align="center">C</td>
				<td align="center"><input type="text" size="5" name="c" /></td>
				<td align="center">100</td>
			</tr>
			<tr>
				<td align="center">Java</td>
				<td align="center"><input type="text" size="5" name="java" /></td>
				<td align="center">100</td>
			</tr>
			<tr>
				<td align="center">.Net</td>
				<td align="center"><input type="text" size="5" name="net" /></td>
				<td align="center">100</td>
			</tr>
			<tr>
				<td align="center">VB</td>
				<td align="center"><input type="text" size="5" name="vb" /></td>
				<td align="center">100</td>
			</tr>
			<tr>
				<td align="center">DBMS</td>
				<td align="center"><input type="text" size="5" name="dbms" /></td>
				<td align="center">100</td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form><br>
	<table>
		<tbody>
			<tr>
				<td><strong>Letter Grade</strong></td>
				<td><strong>Marks</strong></td>
			</tr>
			<tr>
				<td>A+</td>
				<td>90-100</td>
			</tr>
			<tr>
				<td>A</td>
				<td>80-89</td>
			</tr>
			<tr>
				<td>B+</td>
				<td>75-79</td>
			</tr>
			<tr>
				<td>B</td>
				<td>70-74</td>
			</tr>
			<tr>
				<td>B-</td>
				<td>65-69</td>
			</tr>
			<tr>
				<td>C+</td>
				<td>60-64</td>
			</tr>
			<tr>
				<td>C</td>
				<td>55-59</td>
			</tr>
			<tr>
				<td>C-</td>
				<td>50-54</td>
			</tr>
			<tr>
				<td>D</td>
				<td>40-49</td>
			</tr>
			<tr>
				<td>F</td>
				<td>0-39</td>
			</tr>
		</tbody>
	</table>

</body>
</html>