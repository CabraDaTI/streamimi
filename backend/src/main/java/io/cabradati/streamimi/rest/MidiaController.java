package io.cabradati.streamimi.rest;

import io.cabradati.streamimi.rest.dtos.MidiaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("midia")
public class MidiaController {

    @GetMapping
    public ResponseEntity<Object> get(
            @RequestBody MidiaDto dto
    ) {
        return ResponseEntity.ok(dto);
    }

}
