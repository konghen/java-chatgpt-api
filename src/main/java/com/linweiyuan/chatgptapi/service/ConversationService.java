package com.linweiyuan.chatgptapi.service;

import com.linweiyuan.chatgptapi.model.*;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;

public interface ConversationService {
    ResponseEntity<GetConversationsResponse> getConversations(String accessToken, int offset, int limit);

    Flux<StartConversationResponse> startConversation(
            String accessToken,
            StartConversationRequest startConversationRequest
    );

    ResponseEntity<GenConversationTitleResponse> genConversationTitle(
            String accessToken,
            String conversationId,
            GenConversationTitleRequest genConversationTitleRequest
    );
}
