var builder = WebApplication.CreateBuilder(args);
builder.Services.AddControllers().AddNewtonsoftJson();

var app = builder.Build();
// app.UseHttpsRedirection();
app.MapControllers();
app.Run();
