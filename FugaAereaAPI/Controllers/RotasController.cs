using FugaAereaAPI.Models;
using FugaAereaAPI.Repositorio;
using Microsoft.AspNetCore.Mvc;

namespace FugaAereaAPI.Controllers
{
    [Route ("api/[controller]")]
    [ApiController]
    public class RotasController : ControllerBase
    {
        private readonly IRotasRepositorio _rotasRepositorio;
        public RotasController(IRotasRepositorio rotasRepositorio)
        {
            _rotasRepositorio = rotasRepositorio;
        }

        [HttpGet]
        public async Task<IEnumerable<Rotas>> GetRotas()
        {
            return await _rotasRepositorio.Get();
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<Rotas>> GetRotas(int id)
        {
            return await _rotasRepositorio.Get(id);
        }

        [HttpPost]
        public async Task<ActionResult<Rotas>> PostRotas([FromBody] Rotas rotas)
        {
            var newRotas = await _rotasRepositorio.Create(rotas);
            return CreatedAtAction(nameof(GetRotas), new { id = newRotas.Id}, newRotas);
        }

        [HttpDelete ("{id}")]
        public async Task<ActionResult> Delete(int id)
        {
            var rotasToDelete = await _rotasRepositorio.Get(id);

                if (rotasToDelete == null)
                return NoContent();

                await _rotasRepositorio.Delete(rotasToDelete.Id);
                return NoContent();
        }

        [HttpPut]
        public async Task<ActionResult> PutRotas(int id, [FromBody] Rotas rotas)
        {
            if (id != rotas.Id)
                return BadRequest();

                await _rotasRepositorio.Update(rotas);
                         return NoContent();
        }

    }
}