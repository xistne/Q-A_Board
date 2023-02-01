package board.boardqa.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    private String boardId;
    private String subject;
    private String content;
    private LocalDateTime createDateTime;
    private LocalDateTime LastModifyDateTime;
    private String parentBoardId;
    private Long OwnerId;

}