package ru.arkhipov.MySecondTestAppSrpringBoot.service;

import org.springframework.stereotype.Service;
import ru.arkhipov.MySecondTestAppSrpringBoot.model.Request;

@Service
public interface ModifyRequestService {

    void modify(Request request);
}
