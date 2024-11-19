import React, { useState, useEffect } from 'react';

function BusTable() {
  const [buses, setBuses] = useState([]);
  const [error, setError] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    // Realizar la solicitud a la API
    fetch('http://localhost:8021/bus')
      .then((response) => {
        if (!response.ok) {
          throw new Error('No se pudo obtener la lista de buses');
        }
        return response.json();
      })
      .then((data) => {
        setBuses(data); // Actualizar el estado con los datos obtenidos
        setLoading(false); // Dejar de mostrar el estado de carga
      })
      .catch((err) => {
        setError(err.message); // Manejar errores
        setLoading(false);
      });
  }, []);

  if (error) {
    return <div>Error: {error}</div>;
  }

  if (loading) {
    return <div>Cargando...</div>;
  }

  return (
    <div>
      <h2>Lista de Buses</h2>
      <table border="1" style={{ width: '100%', textAlign: 'left' }}>
        <thead>
          <tr>
            <th>ID</th>
            <th>Numero de Bus</th>
            <th>Placa</th>
            <th>Fecha de Creación</th>
            <th>Características</th>
            <th>Marca</th>
            <th>Estado</th>
          </tr>
        </thead>
        <tbody>
          {buses.map((bus) => (
            <tr key={bus.id}>
              <td>{bus.id}</td>
              <td>{bus.numeroBus}</td>
              <td>{bus.placa}</td>
              <td>{new Date(bus.createdDate).toLocaleString()}</td>
              <td>{bus.caracteristicas}</td>
              <td>{bus.marca ? bus.marca.nombre : 'Desconocida'}</td>
              <td>{bus.estado}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default BusTable;
