package com.nttdata.account.api;

import com.nttdata.account.model.document.Account;
import com.nttdata.account.model.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/accounts")
public class AccountController {


  private final AccountService accountService;

  @PostMapping
  public Mono<Account> register(@RequestBody Account account) {
    return accountService.save(account);
  }

  @GetMapping
  public Flux<Account> fetchAll() {
    return accountService.getAll();
  }

  @GetMapping("{id}")
  public Mono<Account> fetchById(@PathVariable String id) {
    return accountService.findById(id);
  }

}
