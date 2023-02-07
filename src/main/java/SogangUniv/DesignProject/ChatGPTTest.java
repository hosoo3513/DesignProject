package SogangUniv.DesignProject;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.edit.EditRequest;

public class ChatGPTTest {
    public static void main(String[] args) {
        OpenAiService service = new OpenAiService("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");

        EditRequest request = EditRequest.builder().model("text-davinci-edit-001")
                .input("me Jack, I like programn in java, how ab you")
                .instruction("Fix the grammar and spelling mistakes")
                .build();

        service.createEdit(request).getChoices().forEach(System.out::println);
    }
}
