package com.example.gmail.service;

import com.example.gmail.bean.UmsMember;
import com.example.gmail.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
