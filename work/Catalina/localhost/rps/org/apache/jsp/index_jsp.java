/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.30
 * Generated at: 2020-03-29 17:17:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Rock Paper Scissors!!!</title>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<html>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("   <body>\r\n");
      out.write("\r\n");
      out.write("      Which one will it be for you today?<br/>\r\n");
      out.write("      <a href=\"#\" onclick=\"playRoshambo('rock')\"> rock </a>\r\n");
      out.write("      <a href=\"#\" onclick=\"playRoshambo('paper')\"> paper </a>\r\n");
      out.write("      <a href=\"#\" onclick=\"playRoshambo('scissors')\"> scissors </a>\r\n");
      out.write("\r\n");
      out.write("      <br/>\r\n");
      out.write("      <div id=\"results\"></div>\r\n");
      out.write("\t  <div id=\"wins\"></div>\r\n");
      out.write("\t  <div id=\"losses\"></div>\r\n");
      out.write("\t  <div id=\"ties\"></div>\r\n");
      out.write("\t  <div id=\"history\"></div>\r\n");
      out.write("\t  \r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("playRoshambo = function(clientGesture) {\r\n");
      out.write("\tconsole.log(\"************** Playing Roshambo *****************\");\r\n");
      out.write("   let gameService = new GameService();\r\n");
      out.write("   let gameSummary = gameService.playGame(clientGesture);\r\n");
      out.write("   let theScore = gameService.getScore();\r\n");
      out.write("\r\n");
      out.write("   console.log(\"Here is the returned gs: \" + gameSummary + \" :---:\");\r\n");
      out.write("\r\n");
      out.write("   document.getElementById('results').innerHTML = gameSummary.result; \r\n");
      out.write("   document.getElementById('wins').innerHTML = theScore.wins; \r\n");
      out.write("   document.getElementById('losses').innerHTML = theScore.losses; \r\n");
      out.write("   document.getElementById('ties').innerHTML = theScore.ties; \r\n");
      out.write("   \r\n");
      out.write("   renderGameHistory(gameService.getGameHistory());\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("renderGameHistory = function(gameHistory){\r\n");
      out.write("\tconsole.log(\"************** RENDERING GAME HISTORY *****************\");\r\n");
      out.write("\tlet output = \"<table><tr><th>Client</th><th>Server</th><th>Result</th><th>Date</th></tr>\";\r\n");
      out.write("\tfor (let i=0; i < gameHistory.length; i++){\r\n");
      out.write("\t\tlet gameSummary = gameHistory[i];\r\n");
      out.write("\t\tlet date = gameSummary.date;\r\n");
      out.write("\t\tconsole.log(gameSummary);\r\n");
      out.write("\t\toutput = output + \" <tr>\";\r\n");
      out.write("\t\toutput = output + \" <td> \" + gameSummary.clientGesture + \" </td> \";\r\n");
      out.write("\t\toutput = output + \" <td> \" + gameSummary.serverGesture  + \" </td> \";\r\n");
      out.write("\t\toutput = output + \" <td> \" + gameSummary.result + \" </td> \";\r\n");
      out.write("\t\toutput = output + \" <td> \" + date + \" </td> \";\r\n");
      out.write("\t\toutput = output + \" </tr>\";\r\n");
      out.write("\t\tconsole.log(output);\r\n");
      out.write("\t}\r\n");
      out.write("\toutput = output + \"</table>\";\r\n");
      out.write("\tdocument.getElementById('history').innerHTML = output; \r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function Score() {\r\n");
      out.write("\r\n");
      out.write("\tthis.wins=0;\r\n");
      out.write("\tthis.losses=0;\r\n");
      out.write("\tthis.ties=0;\r\n");
      out.write("\t\r\n");
      out.write("\tthis.increaseWins = function(){\r\n");
      out.write("\t\tthis.wins++;\r\n");
      out.write("\t}\r\n");
      out.write("\tthis.increaseLosses = function(){\r\n");
      out.write("\t\tthis.losses++;\r\n");
      out.write("\t}\r\n");
      out.write("\t this.increaseTies = function(){\r\n");
      out.write("\t\tthis.ties++;\r\n");
      out.write("\t}\r\n");
      out.write("\tthis.toString = function(){\r\n");
      out.write("\t\toutput = \"Wins: \" + this.wins + \" Ties: \" + this.ties + \" Losses: \" + this.losses;\r\n");
      out.write("\t\treturn output;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function GameSummary(client, server, result) {\r\n");
      out.write("\r\n");
      out.write("\tthis.clientGesture=client;\r\n");
      out.write("\tthis.serverGesture=server;\r\n");
      out.write("\tthis.result=result;\r\n");
      out.write("\tthis.date=new Date();\r\n");
      out.write("\t\r\n");
      out.write("\tthis.getClientGesture = function(){\r\n");
      out.write("\t\tthis.clientGesture;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tthis.getServerGesture = function(){\r\n");
      out.write("\t\tthis.serverGesture;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tthis.getResult = function(){\r\n");
      out.write("\t\tthis.result;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tthis.getDate = function(){\r\n");
      out.write("\t\tthis.date;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tthis.toString = function() {\r\n");
      out.write("\t\tlet output = \"Client :: \" + this.clientGesture;\r\n");
      out.write("\t\tlet simpleDate = this.date.toLocaleDateString(\"en-US\");\r\n");
      out.write("\t\toutput = output + \" :: Server :: \" + this.serverGesture;\r\n");
      out.write("\t\toutput = output + \" :: Result :: \" + this.result;\r\n");
      out.write("\t\toutput = output + \" :: Time played :: \" + simpleDate;\r\n");
      out.write("\t\treturn output;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("let theScore = new Score();\r\n");
      out.write("var gameHistory =[];\r\n");
      out.write("function GameService() {\r\n");
      out.write("\r\n");
      out.write("\tthis.getScore = function() {\t\r\n");
      out.write("\t\treturn theScore;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tthis.getGameHistory = function() {\t\r\n");
      out.write("\t\treturn gameHistory;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tthis.playGame = function(input) {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\tlet result = \"error\";\t\t\r\n");
      out.write("\r\n");
      out.write("\t\tif (input==(\"scissors\")) {\r\n");
      out.write("\t\t\tresult = \"lose\";\r\n");
      out.write("\t\t\ttheScore.increaseLosses();\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif (input==(\"paper\")) {\r\n");
      out.write("\t\t\tresult = \"win\";\r\n");
      out.write("\t\t\ttheScore.increaseWins();\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif (input==(\"rock\")) {\r\n");
      out.write("\t\t\tresult = \"tie\";\r\n");
      out.write("\t\t\ttheScore.increaseTies();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (result == \"error\") { return; }\r\n");
      out.write("\t\tconsole.log(\"The is the result: \" + result);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tlet gameSummary = new GameSummary(input, \"rock\", result);\r\n");
      out.write("\t\tgameHistory.unshift(gameSummary);\r\n");
      out.write("\t\tthis.printGameHistory(gameHistory);\r\n");
      out.write("\r\n");
      out.write("\t\tconsole.log(theScore.toString());\r\n");
      out.write("\t\tconsole.log(\"Number of wins: \" + theScore.wins);\r\n");
      out.write("\t\tconsole.log(gameSummary + \" :: \");\r\n");
      out.write("\t\treturn gameSummary;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tthis.printGameHistory = function(gameHistory){\r\n");
      out.write("\t\tconsole.log(\"************** GAME HISTORY *****************\");\r\n");
      out.write("\t\tlet aggregate = \"\";\r\n");
      out.write("\t\tfor (let i=0; i < gameHistory.length; i++){\r\n");
      out.write("\t\t\tlet gameSummary = gameHistory[i];\r\n");
      out.write("\t\t\tconsole.log(gameSummary);\r\n");
      out.write("\t\t\tlet output = \"Client :: \" + gameSummary.clientGesture;\r\n");
      out.write("\t\t\toutput = output + \" :: Server :: \" + gameSummary.serverGesture;\r\n");
      out.write("\t\t\toutput = output + \" :: Result :: \" + gameSummary.result;\r\n");
      out.write("\t\t\toutput = output + \" :: Time played :: \" + gameSummary.date;\r\n");
      out.write("\t\t\tconsole.log(output);\r\n");
      out.write("\t\t\taggregate =  aggregate + output + \"<br/>\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdocument.getElementById('history').innerHTML = aggregate; \r\n");
      out.write("\t\tconsole.log(\"***********END OF GAME HISTORY *****************\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write("\r\n");
      out.write("let gs = new GameService();\r\n");
      out.write("gs.playGame(\"paper\");\r\n");
      out.write("\r\n");
      out.write("var gameHistory =[];\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("{\r\n");
      out.write("let gameSummary = new GameSummary(\"rock\",\"rock\",\"tie\");\r\n");
      out.write("gameHistory.unshift(gameSummary);\r\n");
      out.write("}\r\n");
      out.write("{\r\n");
      out.write("let gameSummary = new GameSummary(\"paper\",\"rock\",\"loss\");\r\n");
      out.write("gameHistory.unshift(gameSummary);\r\n");
      out.write("}\r\n");
      out.write("{\r\n");
      out.write("let gameSummary = new GameSummary(\"scissors\",\"paper\",\"win\");\r\n");
      out.write("gameHistory.unshift(gameSummary);\r\n");
      out.write("}\r\n");
      out.write("console.log(gameHistory);\r\n");
      out.write("\r\n");
      out.write("var score = new Score();\r\n");
      out.write("score.increaseWins();\r\n");
      out.write("score.increaseWins();\r\n");
      out.write("score.increaseTies();\r\n");
      out.write("score.increaseLosses();\r\n");
      out.write("console.log(score.wins);\r\n");
      out.write("console.log(score.toString());\r\n");
      out.write("*/\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
