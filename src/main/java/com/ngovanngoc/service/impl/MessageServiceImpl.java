package com.ngovanngoc.service.impl;

import com.ngovanngoc.model.Message;
import com.ngovanngoc.repository.IMessageIRepository;
import com.ngovanngoc.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MessageServiceImpl implements IMessageService {

    @Autowired
    private IMessageIRepository messageRepository;

    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public Message findById(Long id) {
        return messageRepository.findById(id);
    }

    @Override
    public void save(Message customer) {
        messageRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        messageRepository.remove(id);
    }
}
