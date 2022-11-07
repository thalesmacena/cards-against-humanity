package br.com.chorival.againsthumanityserver.domain.service.impl;

import br.com.chorival.againsthumanityserver.domain.service.MessageSourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class MessageSourceServiceImpl implements MessageSourceService {

    private final ResourceBundleMessageSource messageSource;

    public String getMessage(String msgCode) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(msgCode, null, locale);
    }

    public String getMessage(String msgCode, Object... args) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(msgCode, args, locale);
    }
}
