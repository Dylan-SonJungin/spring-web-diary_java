package com.diary.diaryproject.domain.service;

import com.diary.diaryproject.domain.aggregate.entity.Address;
import com.diary.diaryproject.domain.dto.AddressDTO;
import com.diary.diaryproject.domain.repository.MapRepository;
import com.diary.diaryproject.domain.aggregate.entity.Phrases;
import com.diary.diaryproject.domain.repository.PhrasesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MapService {
    private final MapRepository mapRepository;


    public Object saveToRepository(AddressDTO addr) {
//        Address address = new Address(addr.getAddress(), addr.getRoadAddress());


        Address address =  Address.builder()
                .address(addr.getAddress())
                .roadAddress(addr.getRoadAddress())
                .build();

        return mapRepository.save(address);
    }

//    public Object loadToRepository(AddressDTO addr) {
//
//
//        return mapRepository.findById(Math.toIntExact(addr.getUserId()));
//    }
}
