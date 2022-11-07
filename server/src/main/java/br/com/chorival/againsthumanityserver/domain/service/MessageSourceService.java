package br.com.chorival.againsthumanityserver.domain.service;

public interface MessageSourceService {

    String getMessage(String msgCode);

    String getMessage(String msgCode, Object... args);

}
