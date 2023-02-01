package board.boardqa.Controller;

import board.boardqa.Service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/**")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @GetMapping("/list")
    public String boardlist(){
        return "/boards/list";
    }

    @GetMapping("/getList")
    public String getList(Model model){

        model.addAttribute("boardList", service.boardList());
        return "/boards/list";

    }

}