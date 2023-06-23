package com.diary.diaryproject.domain.repository;

import com.diary.diaryproject.domain.aggregate.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapRepository extends JpaRepository<Address, Integer> {

//    Address findByIdOrderByAddressNoDesc(String id);
}
