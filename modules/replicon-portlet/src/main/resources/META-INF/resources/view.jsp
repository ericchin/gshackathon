<%@ include file="/init.jsp" %>

<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.liferay.gs.hackathon.model.Replicon" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>

<%@ page import="java.text.SimpleDateFormat" %>

<%
SimpleDateFormat dt = new SimpleDateFormat("h:mm a");
SimpleDateFormat dtDay = new SimpleDateFormat("MMM d");
%>


<!-- <link href="https://fonts.googleapis.com/css?family=Maven+Pro|Proza+Libre|Source+Sans+Pro" rel="stylesheet"> -->
<!-- <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro" rel="stylesheet"> -->
<link href="https://fonts.googleapis.com/css?family=Merriweather|Source+Sans+Pro" rel="stylesheet">


<style>
	body {
		/*font-family: 'Proza Libre', sans-serif;*/
		/*font-family: 'Maven Pro', sans-serif;*/
		font-family: 'Source Sans Pro', sans-serif;
	}

	h1 {
		/*font-weight: bold;*/
		/*font-family: 'Merriweather', sans-serif;*/
	}

	.table-responsive {
		margin: 10px;
	}

	.table {
		font-size: 14px;
	}

	.table th {
		font-size: 16px;
		font-weight: bold;
	}
</style>

<%
    Map pTotals = (Map) renderRequest.getAttribute(RepliconConstants.AVAIL_PROJS_ATTR);
    List names = (List)pTotals.getKeys();
	List<Replicon> repliconList = (List<Replicon>) renderRequest.getAttribute(RepliconConstants.REP_ENTRIES);
%>


<div class="replicon-portlet">

	<div class="table-responsive table-day">
		<h1>Replicon (All Entries)</h1>
	    <table class="table table-striped">
	        <thead>
	        	<tr>
	        		<th>Client Project</th>

	        		<th>Date</th>
	        		<th>Start Time</th>
	        		<th>End Time</th>

	        	</tr>
	        </thead>

	        <tbody>

	        <%
	        	for(Replicon repliconObj : repliconList) {
					double divisionFactorToGetHours = 3600000.0;

	        		/* double totalTime = (repliconObj.getEndTime().getTime() - repliconObj.getStartTime().getTime()) / divisionFactorToGetHours; */
					String pName = repliconObj.getProjectName();
					Double totalTime = (Double) pTotals.get(pName);
	        %>
				<tr>
					<td><%= repliconObj.getProjectName() %></td>

					<td><%= dtDay.format(repliconObj.getStartTime()) %></td>
					<td><%= dt.format(repliconObj.getStartTime()) %></td>
					<td><%= dt.format(repliconObj.getEndTime()) %></td>

				</tr>
			<%
				}
			%>
	        </tbody>
	    </table>
	</div>

	<br>


</div>





<!-- <aui:script>
	setTimeout(function(){
		Liferay.Portlet.refresh('#p_p_id<portlet:namespace />');
		console.log("Hello");
	}, 30000);
</aui:script> -->