package jp.co.askul.prototype.dtos

import com.fasterxml.jackson.annotation.JsonProperty

data class UserDisplayFrame(
        @JsonProperty("id")
        val id: String = ""
)
