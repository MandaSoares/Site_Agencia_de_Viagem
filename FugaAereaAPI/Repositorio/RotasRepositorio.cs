using FugaAereaAPI.Models;
using Microsoft.EntityFrameworkCore;

namespace FugaAereaAPI.Repositorio
{
    public class RotasRepositorio : IRotasRepositorio
    {
        public readonly RotasContext _context;
        public RotasRepositorio(RotasContext context)
            {
                _context = context;
        }
        public async Task<Rotas> Create(Rotas rotas)
        {
            _context.Rotas.Add(rotas);
            await _context.SaveChangesAsync();

            return rotas;
    }

        public async Task Delete(int id)
        {
            var rotasToDelete = await _context.Rotas.FindAsync(id);
            _context.Rotas.Remove(rotasToDelete);
            await _context.SaveChangesAsync();
        }

        public async Task<IEnumerable<Rotas>> Get()
        {
            return await _context.Rotas.ToListAsync();
        }

        public async Task<Rotas> Get(int id)
        {
            return await _context.Rotas.FindAsync(id);
        }

        public async Task Update(Rotas rotas)
        {
            _context.Entry(rotas).State = EntityState.Modified;
            await _context.SaveChangesAsync();
        }

        Task<Rotas> IRotasRepositorio.Update(Rotas rotas)
        {
            throw new NotImplementedException();
        }
    }
}
