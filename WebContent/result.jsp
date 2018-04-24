<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	setInterval("location.href = \"${url}\"", 2000);
</script>
</head>
<body>
	<h1>${text}2秒后跳转</h1>
</body>
</html>