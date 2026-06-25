package com.example.jaipurtravel.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ChatMessageRequest {
    private Long sessionId;

    @NotBlank(message = "Message is required")
    private String message;

    private String city;
    private Long contextTripId;

    // ── Optional trip-planner context from frontend ──
    private Integer days;
    private BigDecimal budget;
    private List<String> interests;
    private String travelStyle;
    private String groupType;
}
