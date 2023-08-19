package willian.dotnet.springpessoasapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import willian.dotnet.springpessoasapi.entity.Pessoa;

@RepositoryRestResource
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
