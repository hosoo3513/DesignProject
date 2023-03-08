package SogangUniv.DesignProject.Gpt;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/getAPI")
@RestController
@RequiredArgsConstructor
public class GptController {
    private final GptService gptService;

    @GetMapping("/make/variable/name")
    public ResponseDto makeVariableName(@Valid @RequestBody RequestMakeNameDto requestMakeNameDto){

        ResponseDto responseDto = gptService.getVariableName(requestMakeNameDto);

        return responseDto;
    }

    @GetMapping("/make/class/name")
    public ResponseDto makeClassName(@Valid @RequestBody RequestMakeNameDto requestMakeNameDto){

        ResponseDto responseDto = gptService.getClassName(requestMakeNameDto);

        return responseDto;
    }

    @GetMapping("/make/conversation")
    public ResponseDto makeConversation(@Valid @RequestBody RequestQuestionDto requestQuestionDto){
        ResponseDto responseDto = gptService.getConversation(requestQuestionDto);

        return responseDto;
    }

    @GetMapping(value = "/make/edit")
    public ResponseDto makeEdit(@Valid @RequestBody RequestEditTextDto requestEditTextDto){
        ResponseDto responseDto = gptService.editText(requestEditTextDto);

        return responseDto;
    }

    @GetMapping("/make/images")
    public ResponseDto makeImages(@Valid @RequestBody RequestQuestionDto requestQuestionDto){
        ResponseDto responseDto = gptService.makeImages(requestQuestionDto);

        return responseDto;
    }

    @GetMapping("gpt/model/list")
    public ResponseDto getModelList(){
        ResponseDto responseDto = gptService.getGPTModels();

        return responseDto;
    }

}
