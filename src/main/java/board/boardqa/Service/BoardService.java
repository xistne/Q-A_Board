package board.boardqa.Service;

import board.boardqa.domain.Board;
import board.boardqa.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {

    private final BoardMapper boardMapper;

    public List<Board> boardList(){
        return boardMapper.getList();
    }

}