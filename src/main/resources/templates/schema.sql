CREATE TABLE board(
    boardId varchar(10) primary key,
    subject varchar(30) not null,
    content varchar(200) not null,
    parentBoardId varchar(10),
    createDateTime DATETIME not null,
    LastModifyDateTime DATETIME DEFAULT CURRENT_TIMESTAMP,
    OwnerId Long not null
);