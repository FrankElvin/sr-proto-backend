
create sequence proto.company_report_id_seq;

create table proto.company_report (
	report_id bigint not null default nextval('proto.company_report_id_seq'),
	company_name varchar(100) not null,
	company_balance float(2) not null,
	year_collected timestamp(6)
);