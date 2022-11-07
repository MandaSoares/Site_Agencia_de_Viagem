using Microsoft.EntityFrameworkCore;

namespace FugaAereaAPI.Models
{
    public class RotasContext : DbContext
    {
        public RotasContext(DbContextOptions<RotasContext> options) : base(options)
        {
            Database.EnsureCreated();
        }

        public DbSet<Rotas> Rotas { get; set; }
    }
}
