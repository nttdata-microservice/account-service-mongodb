package com.nttdata.account.model.service;

import com.nttdata.account.model.document.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService { // Nombre propio

  Flux<Account> getAll();
  Mono<Account> save(Account account);
  Mono<Account> findById(String id);
  Mono<Boolean> existsById(String id);
}
