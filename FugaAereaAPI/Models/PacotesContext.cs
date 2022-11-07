using Microsoft.EntityFrameworkCore;

namespace FugaAereaAPI.Models
{
    public class PacotesContext : DbContext
    {
        public PacotesContext(DbContextOptions<PacotesContext> options) : base(options)
        {
            Database.EnsureCreated();
        }

        public DbSet<Rotas> Pacotes { get; set; }
    }
}
