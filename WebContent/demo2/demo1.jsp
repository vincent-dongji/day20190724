<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>Action的访问</h1>
  <h3>通过method的方式</h3>
  <h3><a href="${ pageContext.request.contextPath }/userFind.action">查询</a></h3>
  <h3><a href="${ pageContext.request.contextPath }/userUpdate.action">修改</a></h3>
  <h3><a href="${ pageContext.request.contextPath }/userDelete.action">删除</a></h3>
  <h3><a href="${ pageContext.request.contextPath }/userSave.action">保存</a></h3>
  
  
 <h3>通过通配符的方式</h3>
  <h3><a href="${ pageContext.request.contextPath }/product_find.action">查询商品</a></h3>
  <h3><a href="${ pageContext.request.contextPath }/product_update.action">修改商品</a></h3>
  <h3><a href="${ pageContext.request.contextPath }/product_delete.action">删除商品</a></h3>
  <h3><a href="${ pageContext.request.contextPath }/product_save.action">保存商品</a></h3>
  
  <h3>通过动态方法访问的方式</h3>
  <h3><a href="${ pageContext.request.contextPath }/Customer!find.action">查询商品</a></h3>
  <h3><a href="${ pageContext.request.contextPath }/Customer!update.action">修改商品</a></h3>
  <h3><a href="${ pageContext.request.contextPath }/Customer!delete.action">删除商品</a></h3>
  <h3><a href="${ pageContext.request.contextPath }/Customer!save.action">保存商品</a></h3>
</body>
</html>