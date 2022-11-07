using FugaAereaAPI.Models;
using FugaAereaAPI.Repositorio;
using Microsoft.AspNetCore.Mvc;

namespace FugaAereaAPI.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class PacotesController : ControllerBase
    {
        private readonly IPacotesRepositorio _pacotesRepositorio;
        public PacotesController(IPacotesRepositorio pacotesRepositorio)
        {
            _pacotesRepositorio = pacotesRepositorio;
        }

        [HttpGet]
        public async Task<IEnumerable<Pacotes>> GetPacotes()
        {
            return await _pacotesRepositorio.Get();
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<Pacotes>> GetPacotes(int id)
        {
            return await _pacotesRepositorio.Get(id);
        }

        [HttpPost]
        public async Task<ActionResult<Pacotes>> PostPacotes([FromBody] Pacotes pacotes)
        {
            var newPacotes = await _pacotesRepositorio.Create(pacotes);
            return CreatedAtAction(nameof(GetPacotes), new { id = newPacotes.Id }, newPacotes);
        }

        [HttpDelete("{id}")]
        public async Task<ActionResult> Delete(int id)
        {
            var pacotesToDelete = await _pacotesRepositorio.Get(id);

            if (pacotesToDelete == null)
                return NoContent();

            await _pacotesRepositorio.Delete(pacotesToDelete.Id);
            return NoContent();
        }

        [HttpPut]
        public async Task<ActionResult> PutPacotes(int id, [FromBody] Pacotes pacotes)
        {
            if (id != pacotes.Id)
                return BadRequest();

            await _pacotesRepositorio.Update(pacotes);
            return NoContent();
        }

    }
}
