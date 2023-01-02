//package controller;
//
//import com.example.domain.Message;
//import com.example.repos.MessageRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.Map;
//
//@Controller
//public class MainController {
//    @Autowired
//    private MessageRepository messageRepository;
//
//    @GetMapping("/")
//    public String greeting() {
//        return "greeting";
//    }
//
//    @GetMapping("/main")
//    public String main(Map<String, Object> model) {
//        Iterable<Message> messageRepositories = messageRepository.findAll();
//        model.put("messages", messageRepositories);
//        return "main";
//    }
//
//    @PostMapping("/main")
//    public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
//        Message message = new Message(text, tag);
//        messageRepository.save(message);
//        Iterable<Message> messageRepositories = messageRepository.findAll();
//        model.put("messages", messageRepositories);
//        return "main";
//    }
//
//    @PostMapping("/filter")
//    public String filter(@RequestParam String filter, Map<String, Object> model) {
//
//        Iterable<Message> message;
//        if (filter != null && filter.isEmpty()) {
//            message = messageRepository.findByTag(filter);
//        } else {
//            message = messageRepository.findAll();
//        }
//        model.put("messages", message);
//        return "main";
//    }
//}