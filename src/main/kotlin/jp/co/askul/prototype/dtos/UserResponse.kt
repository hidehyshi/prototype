package jp.co.askul.prototype.dtos

import com.fasterxml.jackson.annotation.JsonProperty

data class UserResponse(
        @JsonProperty("code")
        val code: String = "",

        @JsonProperty("message")
        val message: String = "",

        @JsonProperty("result")
        val result: UserDisplayFrame
)
