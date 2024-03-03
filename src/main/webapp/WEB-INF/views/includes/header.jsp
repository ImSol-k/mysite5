<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.javaex.vo.UserVo"%>

  
<div id="header" class="clearfix">
	<h1>
		<a href="/mysite3/main">MySite</a>
	</h1>
	<c:choose>
		<c:when test="${empty authUser.getId}">
			<ul>
				<li><a href="/mysite3/user?action=loginForm" class="btn_s">로그인</a></li>
				<li><a href="/mysite3/user?action=joinForm" class="btn_s">회원가입</a></li>
			</ul>
		</c:when>
		<c:otherwise>
			<ul>
				<li>${authUser.name }님 안녕하세요^^</li>
				<li><a href="/mysite3/user?action=logout" class="btn_s">로그아웃</a></li>
				<li><a href="/mysite3/user?action=modifyForm" class="btn_s">회원정보수정</a></li>
			</ul>
		</c:otherwise>
	</c:choose>

</div>
<!-- //header -->

<div id="nav">
	<ul class="clearfix">
		<li><a href="">입사지원서</a></li>
		<li><a href="/mysite3/board?action=list">게시판</a></li>
		<li><a href="">갤러리</a></li>
		<li><a href="/mysite3/guestbook?action=add">방명록</a></li>
	</ul>
</div>