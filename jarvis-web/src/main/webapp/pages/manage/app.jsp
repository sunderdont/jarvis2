<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../common/header.jsp">
    <jsp:param name="uname" value="${user.uname}"/>
    <jsp:param name="platform" value="${platform}"/>
    <jsp:param name="platforms" value="${platforms}"/>
</jsp:include>


<style>
    .modal-dialog{
        width:800px;
    }
</style>

<div class="container">

    <div class="row">
        <div class="col-md-6">
            <nav>
                <ol class="cd-breadcrumb triangle">
                    <li><a href="${contextPath}/">首页</a></li>
                    <li class="current"><em>应用管理</em></li>
                </ol>
            </nav>
        </div>
    </div>

    <div class="row top-buffer">
        <div class="col-md-12">
            <div class="row">
                <div class="col-md-3">
                    <div class="input-group" style="width:100%">
                        <span class="input-group-addon" style="width:35%">应用名称</span>
                        <select id="appName">
                            <option value="all">全部</option>
                            <c:forEach items="${appNameList}" var="appName" varStatus="status">
                                <option value="${appName}">${appName}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="input-group" style="width:100%">
                        <span class="input-group-addon" style="width:35%">类型</span>
                        <select id="appType">
                        </select>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="input-group" style="width:100%">
                        <span class="input-group-addon" style="width:35%">状态</span>
                        <select id="status"></select>
                    </div>
                </div>


                <div class="col-md-3 pull-right">
                    <div class="row">
                        <div class="col-md-6 col-lg-offset-6">
                            <div class="input-group">
                                <button type="button" class="btn btn-primary" onclick="search()">查询</button>
                                <button type="button" class="btn btn-primary" onclick="reset()"
                                        style="margin-left: 3px">重置
                                </button>
                            </div>
                        </div>
                    </div>

                </div>
            </div>


            <div class="row top-buffer">
                <div class="col-md-12">
                    <div id="toolbar">
                        <a class="btn btn-primary" href="${contextPath}/manage/appDetail" target="_blank">新增应用</a>
                    </div>
                    <table id="content" data-toolbar="#toolbar">

                    </table>

                </div>

            </div>

        </div>
    </div>
</div>

<!-- 显示workerGroup的模态框 -->
<div id="workerGroupModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="关闭">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">App对应的WorkerGroup列表</h4>
            </div>
            <div class="modal-body">
                <table id="workerGroupList">

                </table>
            </div>
            <div class="modal-footer">
                <button type="button " data-dismiss="modal" class="btn btn-primary" >确定</button>
            </div>
        </div>
    </div>
</div>



<jsp:include page="../common/login.jsp">
    <jsp:param name="uname" value="${user.uname}"/>
</jsp:include>


<jsp:include page="../common/footer.jsp">
    <jsp:param name="menuMap" value="${menuMap}"/>
</jsp:include>

<script type="text/javascript" src="${contextPath}/assets/js/jarvis/manage/app.js"></script>