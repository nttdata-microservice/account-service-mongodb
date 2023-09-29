package com.nttdata.account.api;

import com.nttdata.account.model.document.Account;
import com.nttdata.account.model.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/accounts")
public class AccountController {

  @Autowired
  private AccountService accountService;

  @PostMapping
  public Mono<Account> register(@RequestBody Account account) {
    return accountService.save(account);
  }
}
