package jp.co.askul.prototype

import jp.co.askul.prototype.dtos.UserDisplayFrame
import jp.co.askul.prototype.dtos.UserResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @RequestMapping(
            value = ["/api/user/"],
            produces = ["application/json"],
            method = [RequestMethod.GET]
    )
    fun fetchUse(): ResponseEntity<UserResponse> {
        return ResponseEntity(
                UserResponse(
                        code = "0000",
                        message = "",
                        result = UserDisplayFrame(
                                id = "101"
                        )
                ),
                HttpStatus.OK
        )
    }
}