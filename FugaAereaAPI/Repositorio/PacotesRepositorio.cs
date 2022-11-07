using FugaAereaAPI.Models;
using Microsoft.EntityFrameworkCore;

namespace FugaAereaAPI.Repositorio
{
    public class PacotesRepositorio : IPacotesRepositorio
    {
        public readonly PacotesContext _context;

        public PacotesRepositorio(PacotesContext context)
        {
            _context = context;
        }
        public async Task<Rotas> Create(Rotas pacotes)
        {
            _context.Pacotes.Add(pacotes);
            await _context.SaveChangesAsync();

            return pacotes;
        }

        public Task<Pacotes> Create(Pacotes pacotes)
        {
            throw new NotImplementedException();
        }

        public async Task Delete(int id)
        {
            var pacotesToDelete = await _context.Pacotes.FindAsync(id);
            _context.Pacotes.Remove(pacotesToDelete);
            await _context.SaveChangesAsync();
        }

        public async Task<IEnumerable<Rotas>> Get()
        {
          return await  _context.Pacotes.ToListAsync();
        }

        public async Task<Rotas> Get(int id)
        {
            return await _context.Pacotes.FindAsync(id);
        }

        public async Task Update(Rotas pacotes)
        {
            _context.Entry(pacotes).State = EntityState.Modified;
            await _context.SaveChangesAsync();
        }

        public Task<Pacotes> Update(Pacotes pacotes)
        {
            throw new NotImplementedException();
        }

        Task<IEnumerable<Pacotes>> IPacotesRepositorio.Get()
        {
            throw new NotImplementedException();
        }

        Task<Pacotes> IPacotesRepositorio.Get(int Id)
        {
            throw new NotImplementedException();
        }
    }
}
