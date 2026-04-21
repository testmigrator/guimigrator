import SwiftUI

struct Activity_at_command: View {
  var body: some View {
    ZStack {
      Text("").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1))
      Text("").foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_at_command_Previews: PreviewProvider {
  static var previews: some View {
    Activity_at_command()
  }
}
