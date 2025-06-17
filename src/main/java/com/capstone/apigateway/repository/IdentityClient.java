package com.capstone.apigateway.repository;

import com.capstone.apigateway.dto.ApiResponse;
import com.capstone.apigateway.dto.request.IntrospectRequest;
import com.capstone.apigateway.dto.response.IntrospectResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;
import reactor.core.publisher.Mono;

public interface IdentityClient {
    @PostExchange(url = "api/v1/auth/introspect", contentType = MediaType.APPLICATION_JSON_VALUE)
    Mono<ApiResponse<IntrospectResponse>> introspect(@RequestBody IntrospectRequest request);
}
