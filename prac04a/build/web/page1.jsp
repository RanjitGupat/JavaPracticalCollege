<h1>Demo of Implicit Object</h1>
<hr><h1> REQUEST OBJECT</h1>
<h1>CHARACTER ENCODING <%=request.getCharacterEncoding()%></h1>
<h1>Local Address <%=request.getLocalAddr()%></h1>
<h1>local Name <%=request.getLocalName()%></h1>
<h1>Method Name for Form Submission<%=request.getMethod()%></h1>

<hr><h1>SESSION OBJECT</h1>
<h1>SESSION ID <%=session.getId()%></h1>
<h1>Session Created On <%=new java.util.Date(session.getCreationTime())%></h1>
<h1>Session Accessed On <%=new java.util.Date(session.getLastAccessedTime())%></h1>

<hr><h1>Application Object</h1>
<h1>CONTEXT NAME <%=application.getServletContextName()%></h1>
<h1>SERVER NAME <%=application.getVirtualServerName()%></h1>
<h1>SERVER INFO <%=application.getServerInfo()%></h1>