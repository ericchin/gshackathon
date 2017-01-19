<%@ include file="/init.jsp" %>

<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.liferay.gs.hackathon.model.Replicon" %>
<%@ page import="java.util.List" %>


<%
	List<Replicon> repliconList = (List<Replicon>) renderRequest.getAttribute(RepliconConstants.REP_ENTRIES);
%>

<div class="replicon-portlet">

	<div class="table-responsive">
	    <table class="table table-striped">
	        <thead>
	        	<tr>
	        		<th>Client | Project | Task</th>
	        		<th>Billing</th>
	        		<th>Activity</th>
	        		<th></th>
	        		<th></th>
	        		<th></th>
	        		<th></th>
	        		<th></th>
	        		<th></th>
	        		<th></th>
	        		<th>Total</th>
	        	</tr>
	        </thead>

	        <tbody>

	        <%
	        	for(Replicon repliconObj : repliconList) {
	        %>
				<tr>
					<td><%= repliconObj.getProjectName() %></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td>0.00</td>
				</tr>
			<%
				}
			%>
	        </tbody>
	    </table>
	</div>
</div>









<!-- REFERENCE -->



<div class="replicon-portlet">
	<div id="tsGrid" class="timesheetGrid">
		<table class="timesheet" id="tsGridTable" eventtarget="grid">
			<tbody>
			<tr id="tsTimeGridSection" class="markerRowType enabled" style="display:;">
				<th id="_84" class="columnHeader leftColumnHeader">
					<a class="" eventtarget="addRow_time" title="Add Time Row" href="javascript:;">
						<span title="Add Time Row" class="duplicateRowIcon"></span>
					</a>
				</th>

				<th id="sc_task" class="columnHeader">
					<a class="dropDownAnchor enabled sortableDropDownAnchor" eventtarget="complicatedSortableColumn" id="" href="javascript:;">Client • Project • Task</a>
				</th>

				<th id="sc_billing" class="columnHeader sortableColumnHeader" eventtarget="sortableColumn">Billing
					<span class="icon-container"></span>
				</th>

				<th id="sc_activity" class="columnHeader sortableColumnHeader" eventtarget="sortableColumn">Activity
					<span class="icon-container"></span>
				</th>

				<th id="_86" class="columnHeader" style="display:none;">

				</th>



				<th id="_77" class="columnHeader"><%= renderRequest.getAttribute(RepliconConstants.TODAY_ATTR) %></th>

				<th id="_78" class="columnHeader">Tue 24</th>

				<th id="_79" class="columnHeader">Wed 25</th>

				<th id="_80" class="columnHeader">Thu 26</th>

				<th id="_81" class="columnHeader">Fri 27</th>

				<th id="_82" class="columnHeader">Sat 28</th>

				<th id="_83" class="columnHeader">Sun 29</th>

				<th id="_88" class="columnHeader rightColumnHeader">Total</th>

				<th id="_91" class="columnHeader" colspan="3" style="display:none;">Progress</th>
			</tr>

			<tr type="time" id="_152" rowid="1" eventtarget="selectableRow">
				<td id="_153" class="rowField rowFunctions leftColumnItem">
					<a class="" eventtarget="duplicateRow" title="Duplicate Row" href="javascript:;">
						<span title="Duplicate Row" class="duplicateRowIcon"></span>
					</a>

					<a class="" eventtarget="deleteRow" title="Delete Row" href="javascript:;">
						<span title="Delete Row" class="deleteRowIcon"></span>
					</a>
				</td>

				<td id="_156" class="rowField rowTask">
					<a class="dropDownAnchor enabled timesheetDropDown includesAdditional" eventtarget="selectTask" clientprogramvalue="459" projectvalue="1641" taskvalue="3381" id="_157" href="javascript:;"><span id="_157_clientProgramPartName" class="clientProgramPartName">Hewlett Packard Inc. • </span><span id="_157_projectPartName" class="projectPartName">HPI - DaaS Customer Portal (Phase 2)</span><span id="_157_taskPartName" class="taskPartName additional">  • <span class="selected">DaaS Customer User</span></span></a>
				</td>

				<td id="_158" class="rowField rowBilling">
					<a class="dropDownAnchor enabled timesheetDropDown includesAdditional" eventtarget="BillingDropDown" value="f23e54a19e015acdba8fca5891f6f14c" id="_159" href="javascript:;">Billable<span class="additional">UI Consultant</span></a>
				</td>

				<td id="_163" class="rowField rowActivity">
					<a class="dropDownAnchor enabled" eventtarget="ActivityDropDown" id="_164" href="javascript:;">&lt; None &gt;</a>
				</td>

				<td id="_162" class="rowField rowFiller" style="display:none;"></td>

				<td id="_165" eventtarget="cell" class="cell"><input class="" maxlength="6"></td>

				<td id="_166" eventtarget="cell" class="cell"><input class="" maxlength="6"></td>

				<td id="_167" eventtarget="cell" class="cell"><input class="" maxlength="6"></td>

				<td id="_168" eventtarget="cell" class="cell"><input class="" maxlength="6"></td>

				<td id="_169" eventtarget="cell" class="cell"><input class="" maxlength="6"></td>

				<td id="_170" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td>

				<td id="_171" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td>

				<td id="_154" class="rowTotal rightColumn">
					<div titlehtml="0.00" style="white-space:nowrap;">
						0.00
					</div>
				</td>

				<td id="_161-percentage" class="rowField progress percentage" style="display:none;">&nbsp;</td>

				<td id="_161-bar" class="rowField progress bar" style="display:none;">&nbsp;</td>

				<td id="_161-hours" class="rowField progress hours rightColumn" style="display:none;">&nbsp;</td>
			</tr>


			<tr type="time" id="_172" rowid="2" eventtarget="selectableRow">
				<td id="_173" class="rowField rowFunctions leftColumnItem"><a class="" eventtarget="duplicateRow" title="Duplicate Row" href="javascript:;"><span title="Duplicate Row" class="duplicateRowIcon"></span></a><a class="" eventtarget="deleteRow" title="Delete Row" href="javascript:;"><span title="Delete Row" class="deleteRowIcon"></span></a></td><td id="_176" class="rowField rowTask"><a class="dropDownAnchor enabled timesheetDropDown includesAdditional" eventtarget="selectTask" clientprogramvalue="10" projectvalue="741" taskvalue="2690" id="_177" href="javascript:;"><span id="_177_clientProgramPartName" class="clientProgramPartName">Liferay INC • </span><span id="_177_projectPartName" class="projectPartName">GS Internal Project</span><span id="_177_taskPartName" class="taskPartName additional">  • <span class="selected">Holiday</span></span></a></td><td id="_178" class="rowField rowBilling"><a class="dropDownAnchor enabled timesheetDropDown" eventtarget="BillingDropDown" value="none" id="_179" href="javascript:;">Non-billable</a></td><td id="_183" class="rowField rowActivity"><a class="dropDownAnchor enabled" eventtarget="ActivityDropDown" id="_184" href="javascript:;">&lt; None &gt;</a></td><td id="_182" class="rowField rowFiller" style="display:none;"></td><td id="_185" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_186" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_187" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_188" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_189" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_190" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td><td id="_191" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td><td id="_174" class="rowTotal rightColumn"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_181-percentage" class="rowField progress percentage" style="display:none;">&nbsp;</td><td id="_181-bar" class="rowField progress bar" style="display:none;">&nbsp;</td><td id="_181-hours" class="rowField progress hours rightColumn" style="display:none;">&nbsp;</td>
			</tr><tr type="time" id="_192" rowid="3" eventtarget="selectableRow">
				<td id="_193" class="rowField rowFunctions leftColumnItem"><a class="" eventtarget="duplicateRow" title="Duplicate Row" href="javascript:;"><span title="Duplicate Row" class="duplicateRowIcon"></span></a><a class="" eventtarget="deleteRow" title="Delete Row" href="javascript:;"><span title="Delete Row" class="deleteRowIcon"></span></a></td><td id="_196" class="rowField rowTask"><a class="dropDownAnchor enabled timesheetDropDown" eventtarget="selectTask" clientprogramvalue="459" projectvalue="1641" taskvalue="" id="_197" href="javascript:;"><span id="_197_clientProgramPartName" class="clientProgramPartName">Hewlett Packard Inc. • </span><span id="_197_projectPartName" class="projectPartName selected">HPI - DaaS Customer Portal (Phase 2)</span><span id="_197_taskPartName" class="taskPartName additional"><span class="selected"></span></span></a></td><td id="_198" class="rowField rowBilling"><a class="dropDownAnchor enabled timesheetDropDown" eventtarget="BillingDropDown" value="none" id="_199" href="javascript:;">Non-billable</a></td><td id="_203" class="rowField rowActivity"><a class="dropDownAnchor enabled" eventtarget="ActivityDropDown" id="_204" href="javascript:;">&lt; None &gt;</a></td><td id="_202" class="rowField rowFiller" style="display:none;"></td><td id="_205" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_206" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_207" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_208" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_209" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_210" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td><td id="_211" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td><td id="_194" class="rowTotal rightColumn"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_201-percentage" class="rowField progress percentage" style="display:none;">&nbsp;</td><td id="_201-bar" class="rowField progress bar" style="display:none;">&nbsp;</td><td id="_201-hours" class="rowField progress hours rightColumn" style="display:none;">&nbsp;</td>
			</tr><tr type="time" id="_212" rowid="4" eventtarget="selectableRow">
				<td id="_213" class="rowField rowFunctions leftColumnItem"><a class="" eventtarget="duplicateRow" title="Duplicate Row" href="javascript:;"><span title="Duplicate Row" class="duplicateRowIcon"></span></a><a class="" eventtarget="deleteRow" title="Delete Row" href="javascript:;"><span title="Delete Row" class="deleteRowIcon"></span></a></td><td id="_216" class="rowField rowTask"><a class="dropDownAnchor enabled timesheetDropDown includesAdditional" eventtarget="selectTask" clientprogramvalue="10" projectvalue="741" taskvalue="1838" id="_217" href="javascript:;"><span id="_217_clientProgramPartName" class="clientProgramPartName">Liferay INC • </span><span id="_217_projectPartName" class="projectPartName">GS Internal Project</span><span id="_217_taskPartName" class="taskPartName additional">  • <span class="selected">TS</span></span></a></td><td id="_218" class="rowField rowBilling"><a class="dropDownAnchor enabled timesheetDropDown" eventtarget="BillingDropDown" value="none" id="_219" href="javascript:;">Non-billable</a></td><td id="_223" class="rowField rowActivity"><a class="dropDownAnchor enabled" eventtarget="ActivityDropDown" id="_224" href="javascript:;">&lt; None &gt;</a></td><td id="_222" class="rowField rowFiller" style="display:none;"></td><td id="_225" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_226" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_227" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_228" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_229" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_230" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td><td id="_231" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td><td id="_214" class="rowTotal rightColumn"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_221-percentage" class="rowField progress percentage" style="display:none;">&nbsp;</td><td id="_221-bar" class="rowField progress bar" style="display:none;">&nbsp;</td><td id="_221-hours" class="rowField progress hours rightColumn" style="display:none;">&nbsp;</td>
			</tr><tr type="time" id="_232" rowid="5" eventtarget="selectableRow">
				<td id="_233" class="rowField rowFunctions leftColumnItem"><a class="" eventtarget="duplicateRow" title="Duplicate Row" href="javascript:;"><span title="Duplicate Row" class="duplicateRowIcon"></span></a><a class="" eventtarget="deleteRow" title="Delete Row" href="javascript:;"><span title="Delete Row" class="deleteRowIcon"></span></a></td><td id="_236" class="rowField rowTask"><a class="dropDownAnchor enabled timesheetDropDown includesAdditional" eventtarget="selectTask" clientprogramvalue="10" projectvalue="741" taskvalue="1871" id="_237" href="javascript:;"><span id="_237_clientProgramPartName" class="clientProgramPartName">Liferay INC • </span><span id="_237_projectPartName" class="projectPartName">GS Internal Project</span><span id="_237_taskPartName" class="taskPartName additional">  • Client Support / <span class="selected">Pre-Sales Client Support</span></span></a></td><td id="_238" class="rowField rowBilling"><a class="dropDownAnchor enabled timesheetDropDown" eventtarget="BillingDropDown" value="none" id="_239" href="javascript:;">Non-billable</a></td><td id="_243" class="rowField rowActivity"><a class="dropDownAnchor enabled" eventtarget="ActivityDropDown" id="_244" href="javascript:;">&lt; None &gt;</a></td><td id="_242" class="rowField rowFiller" style="display:none;"></td><td id="_245" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_246" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_247" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_248" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_249" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_250" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td><td id="_251" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td><td id="_234" class="rowTotal rightColumn"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_241-percentage" class="rowField progress percentage" style="display:none;">&nbsp;</td><td id="_241-bar" class="rowField progress bar" style="display:none;">&nbsp;</td><td id="_241-hours" class="rowField progress hours rightColumn" style="display:none;">&nbsp;</td>
			</tr><tr type="time" id="_252" rowid="6" eventtarget="selectableRow">
				<td id="_253" class="rowField rowFunctions leftColumnItem"><a class="" eventtarget="duplicateRow" title="Duplicate Row" href="javascript:;"><span title="Duplicate Row" class="duplicateRowIcon"></span></a><a class="" eventtarget="deleteRow" title="Delete Row" href="javascript:;"><span title="Delete Row" class="deleteRowIcon"></span></a></td><td id="_256" class="rowField rowTask"><a class="dropDownAnchor enabled timesheetDropDown includesAdditional" eventtarget="selectTask" clientprogramvalue="10" projectvalue="741" taskvalue="1790" id="_257" href="javascript:;"><span id="_257_clientProgramPartName" class="clientProgramPartName">Liferay INC • </span><span id="_257_projectPartName" class="projectPartName">GS Internal Project</span><span id="_257_taskPartName" class="taskPartName additional">  • <span class="selected">Meetings</span></span></a></td><td id="_258" class="rowField rowBilling"><a class="dropDownAnchor enabled timesheetDropDown" eventtarget="BillingDropDown" value="none" id="_259" href="javascript:;">Non-billable</a></td><td id="_263" class="rowField rowActivity"><a class="dropDownAnchor enabled" eventtarget="ActivityDropDown" id="_264" href="javascript:;">&lt; None &gt;</a></td><td id="_262" class="rowField rowFiller" style="display:none;"></td><td id="_265" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_266" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_267" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_268" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_269" eventtarget="cell" class="cell"><input class="" maxlength="6"></td><td id="_270" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td><td id="_271" eventtarget="cell" class="cell dayOffCell"><input class="" maxlength="6"></td><td id="_254" class="rowTotal rightColumn"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_261-percentage" class="rowField progress percentage" style="display:none;">&nbsp;</td><td id="_261-bar" class="rowField progress bar" style="display:none;">&nbsp;</td><td id="_261-hours" class="rowField progress hours rightColumn" style="display:none;">&nbsp;</td>
			</tr><tr type="time" id="tsTimeEndMarker" style="display:;">
				<td id="tsTimeEndMarker_cell" class="lastRow" colspan="12"></td>
			</tr><tr id="tsTimeOffGridSection" class="markerRowType enabled" style="display:;">
				<th id="_127" class="columnHeader leftColumnHeader"><a class="" eventtarget="addTimeOffBooking" title="Add Time Off" href="javascript:;"><span title="Add Time Off" class="duplicateRowIcon"></span></a></th><th id="sc_timeoff" class="columnHeader sortableColumnHeader" colspan="3" eventtarget="sortableColumn">Time Off<span class="icon-container"></span></th><th id="_129" class="columnHeader" style="display:none;"></th><th id="_120" class="columnHeader">Mon 23</th><th id="_121" class="columnHeader">Tue 24</th><th id="_122" class="columnHeader">Wed 25</th><th id="_123" class="columnHeader">Thu 26</th><th id="_124" class="columnHeader">Fri 27</th><th id="_125" class="columnHeader">Sat 28</th><th id="_126" class="columnHeader">Sun 29</th><th id="_131" class="columnHeader rightColumnHeader">Total</th>
			</tr><tr class="blankRow">
				<td id="tsTimeOffBlankRow" colspan="12" style="display:;">No Time Off Booked</td>
			</tr><tr type="timeOffBooking" id="tsTimeOffEndMarker" style="display:;">
				<td id="tsTimeOffEndMarker_cell" class="lastRow" colspan="12"></td>
			</tr><tr rowcomponent="rowFooterHeadings" id="rowFooterHeadings_tsGridTable" style="display:none;">
				<th id="_36" class="totalFooter" colspan="4"></th><th id="_38" class="columnHeader" style="display:none;"></th><th id="" class="columnHeader">Mon 23</th><th id="" class="columnHeader">Tue 24</th><th id="" class="columnHeader">Wed 25</th><th id="" class="columnHeader">Thu 26</th><th id="" class="columnHeader">Fri 27</th><th id="" class="columnHeader">Sat 28</th><th id="" class="columnHeader">Sun 29</th><th id="_40" class="columnHeader">Total</th>
			</tr><tr rowcomponent="rowColumnTotals" class="rowColumnTotals" id="_34">
				<th id="_37" class="totalFooter" colspan="4">Total</th><th id="_39" class="columnHeader" style="display:none;"></th><td id="_35" class="columnTotal"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_41" class="columnTotal"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_42" class="columnTotal"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_43" class="columnTotal"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_44" class="columnTotal"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_45" class="columnTotal dayOffColumnTotal"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_46" class="columnTotal dayOffColumnTotal"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_47" class="grandTotal"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td>
			</tr>
		</tbody></table><table id="copyRowsTable_tsGridTable" style="display:none;">
			<tbody><tr type="time" id="tsTimeCopyRow" rowid="0">
				<td id="_48" class="rowField rowFunctions"><span style="zoom:1;"></span></td><td id="_51" class="rowField rowTask readOnly"><div>
					<span class=" projectPartName selected">&lt; No Project &gt;</span>
				</div></td><td id="_53" class="rowField rowBilling readOnly"><div>

				</div></td><td id="_58" class="rowField rowActivity"><a class="dropDownAnchor enabled" eventtarget="ActivityDropDown" id="_59" href="javascript:;">&nbsp;</a></td><td id="_57" class="rowField rowFiller" style="display:none;"></td><td id="_60" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_61" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_62" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_63" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_64" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_65" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_66" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_49" class="rowTotal rightColumn"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td><td id="_56-percentage" class="rowField progress percentage" style="display:none;">&nbsp;</td><td id="_56-bar" class="rowField progress bar" style="display:none;">&nbsp;</td><td id="_56-hours" class="rowField progress hours rightColumn" style="display:none;">&nbsp;</td>
			</tr><tr type="timeOffBooking" id="tsTimeOffCopyRow" rowid="0">
				<td id="_92" class="rowField rowFunctions"><span style="zoom:1;"></span></td><td id="_101" class="rowField rowTimeOffBooking" colspan="3"><span id="_102" class="timeOffTypeSpan timesheetDropDown"><span title="Jan 1, 0001 - Jan 1, 0001 (Not Submitted)" class="openBookingRowIcon"></span></span><div class="timeOffAdd">

				</div></td><td id="_103" class="rowField rowFiller" style="display:none;"></td><td id="_104" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_105" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_106" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_107" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_108" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_109" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_110" eventtarget="cell" class="cell disabledCell"><span>&nbsp;</span></td><td id="_93" class="rowTotal rightColumn"><div titlehtml="0.00" style="white-space:nowrap;">
					0.00
				</div></td>
			</tr>
		</tbody></table><div id="_132" class="">

		</div><div id="_133" class="">

		</div><div id="_134">

		</div><table id="tsHeadingUdfs" class="tsUdf">

		</table>
	<div id="timesheetHud_columnContainer"></div><div id="timesheetHud_footerContainer"></div><div id="timesheetHud_toolbarContainer"></div></div>


</div>