package com.app.controller;

// import org.springframework.messaging.handler.annotation.MessageMapping;
// import org.springframework.messaging.handler.annotation.SendTo;
// import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.modal.CallAnswerRequest;
import com.app.entity.modal.CallRequest;
import com.app.entity.modal.CallTerminateRequest;
import com.app.entity.modal.MediaStatus;
import com.app.entity.modal.MessageRequest;

@RestController
public class WebSocketController {

    // private final SimpMessagingTemplate simpMessagingTemplate;

    // public WebSocketController(SimpMessagingTemplate simpMessagingTemplate) {
    // this.simpMessagingTemplate = simpMessagingTemplate;
    // }

    // // Emit socketId to the client after connection (same as
    // socket.emit("socketId",
    // // ...))
    // @MessageMapping("/connect")
    // public void connect(String socketId) {
    // simpMessagingTemplate.convertAndSend("/topic/socketId", socketId);
    // }

    // // Handle call initiation (same as socket.on("initiateCall", ...))
    // @MessageMapping("/initiateCall")
    // public void initiateCall(CallRequest callRequest) {
    // simpMessagingTemplate.convertAndSendToUser(callRequest.getTargetId(),
    // "/queue/incomingCall", callRequest);
    // }

    // // Handle media status change (same as socket.on("changeMediaStatus", ...))
    // @MessageMapping("/changeMediaStatus")
    // @SendTo("/topic/mediaStatusChanged")
    // public MediaStatus changeMediaStatus(MediaStatus mediaStatus) {
    // return mediaStatus;
    // }

    // // Handle sending messages (same as socket.on("sendMessage", ...))
    // @MessageMapping("/sendMessage")
    // public void sendMessage(MessageRequest messageRequest) {
    // simpMessagingTemplate.convertAndSendToUser(messageRequest.getTargetId(),
    // "/queue/receiveMessage",
    // messageRequest);
    // }

    // // Handle answering a call (same as socket.on("answerCall", ...))
    // @MessageMapping("/answerCall")
    // public void answerCall(CallAnswerRequest callAnswerRequest) {
    // simpMessagingTemplate.convertAndSendToUser(callAnswerRequest.getTo(),
    // "/queue/callAnswered", callAnswerRequest);
    // }

    // // Handle terminating a call (same as socket.on("terminateCall", ...))
    // @MessageMapping("/terminateCall")
    // public void terminateCall(CallTerminateRequest callTerminateRequest) {
    // simpMessagingTemplate.convertAndSendToUser(callTerminateRequest.getTargetId(),
    // "/queue/callTerminated",
    // callTerminateRequest);
    // }
}
