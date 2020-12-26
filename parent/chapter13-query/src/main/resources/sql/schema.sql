drop table LEAVE if exists;
create table LEAVE 
(
   ID                   bigint  generated by default as identity         not null,
   PROCESS_INSTANCE_ID  VARCHAR2(64),
   USER_ID              VARCHAR2(20)           not null,
   START_TIME           TIMESTAMP            not null,
   END_TIME             TIMESTAMP            not null,
   LEAVE_TYPE           VARCHAR2(20),
   REASON               VARCHAR2(2000),
   APPLY_TIME           TIMESTAMP            not null,
   REALITY_START_TIME   TIMESTAMP,
   REALITY_END_TIME     TIMESTAMP,
   constraint PK_LEAVE primary key (ID)
);

comment on table LEAVE is
'请假';

comment on column LEAVE.ID is
'ID';

comment on column LEAVE.PROCESS_INSTANCE_ID is
'流程ID';

comment on column LEAVE.USER_ID is
'工号';

comment on column LEAVE.START_TIME is
'开始时间';

comment on column LEAVE.END_TIME is
'结束时间';

comment on column LEAVE.LEAVE_TYPE is
'假种';

comment on column LEAVE.REASON is
'请假事由';

comment on column LEAVE.APPLY_TIME is
'申请时间';

comment on column LEAVE.REALITY_START_TIME is
'实际开始时间';

comment on column LEAVE.REALITY_END_TIME is
'实际结束时间';