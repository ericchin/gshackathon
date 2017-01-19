create table GS_Replicon (
	uuid_ VARCHAR(75) null,
	projectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	projectName VARCHAR(75) null,
	startTime VARCHAR(75) null,
	endTime VARCHAR(75) null
);