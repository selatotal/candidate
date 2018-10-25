create table candidate (
  id integer identity primary key,
  name varchar(255) not null,
  number integer not null,
  election_id integer not null,
  party_id integer not null
);
