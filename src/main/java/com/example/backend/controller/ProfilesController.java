package com.example.backend.controller;

import com.example.backend.DTO.ProfilesResponse;
import com.example.backend.moder.Profiles;
import com.example.backend.repository.ProfilesRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfilesController {
    @Autowired
    private ProfilesRepository profilesRepository;
    //Hiển thị dânh sách các profile
    @GetMapping("chess-online/profiles-hienThi")
    private List<Profiles> hienThi(){
        return profilesRepository.findAll();
    }
    @GetMapping("chess-online/profiles-hienThiReponest")
    private List<ProfilesResponse> hienThiReponest(){
        return profilesRepository.getAllProfiles();
    }
    //Hiển thị chi tiết của 1 người
    @GetMapping("chess-online/profiles/{id}")
    private Profiles chiTiet(@PathVariable("id")Integer id){
        return profilesRepository.findById(id).get();
    }
    //Sua thong tin
    @PostMapping("chess-online/profiles-update")
    private String upadate(@RequestBody Profiles po){
        profilesRepository.save(po);
        return "Sua Thanh Cong";
    }
}
