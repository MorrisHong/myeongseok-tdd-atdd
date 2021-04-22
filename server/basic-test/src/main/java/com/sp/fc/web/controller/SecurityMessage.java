package com.sp.fc.web.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.Authentication;

/**
 * @author : Eunmo Hong
 * @since : 2021/04/23
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SecurityMessage {

	private Authentication auth;
	private String message;
}
