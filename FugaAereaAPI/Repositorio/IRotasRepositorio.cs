using FugaAereaAPI.Models;

namespace FugaAereaAPI.Repositorio
{
    public interface IRotasRepositorio
    {
        Task<IEnumerable<Rotas>> Get();

        Task<Rotas> Get(int Id);

        Task<Rotas> Create(Rotas rotas);

        Task<Rotas> Update(Rotas rotas);

        Task Delete(int Id);
    }
}
