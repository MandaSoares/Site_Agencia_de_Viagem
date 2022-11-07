using FugaAereaAPI.Controllers;
using FugaAereaAPI.Models;

namespace FugaAereaAPI.Repositorio
{
    public interface IPacotesRepositorio
    {
        Task<IEnumerable<Pacotes>> Get();

        Task<Pacotes> Get(int Id);

        Task<Pacotes> Create(Pacotes pacotes);

        Task<Pacotes> Update(Pacotes pacotes);

        Task Delete(int Id);

    }
}
