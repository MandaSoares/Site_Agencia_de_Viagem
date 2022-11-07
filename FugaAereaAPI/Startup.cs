using FugaAereaAPI.Models;
using FugaAereaAPI.Repositorio;
using Microsoft.EntityFrameworkCore;

namespace FugaAereaAPI
{
    public class Startup
    {
        public Startup(IConfiguration configuration)
        {
            configuration = configuration;
        }
        public IConfiguration configuration { get; }
        public void ConfigureServices(IServiceCollection services)
        {
          services.AddDbContext<PacotesContext>(x => x.UseSqlite("Data source=pacotes.db")); 
          services.AddDbContext<RotasContext>(x => x.UseSqlite("Data source=rotas.db"));
          services.AddScoped<IPacotesRepositorio, PacotesRepositorio>();
          services.AddScoped<IRotasRepositorio, RotasRepositorio>();
          services.AddControllers();
          services.AddSwaggerGen(c =>
            {
                c.SwaggerDoc("v1", new Microsoft.OpenApi.Models.OpenApiInfo { Title = "FugaAereaAPI", Version = "v1" });
            });
        }
        public void Configure(IApplicationBuilder app, IWebHostEnvironment env)
        {
            if (!env.IsDevelopment())
            {
                app.UseExceptionHandler("/Error");
                // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
                app.UseHsts();
            }
            app.UseHttpsRedirection();
            app.UseStaticFiles();
            app.UseRouting();
            app.UseAuthorization();
            app.UseEndpoints(endpoints =>
            {
                endpoints.MapControllers();
            });
        }
    }
}
